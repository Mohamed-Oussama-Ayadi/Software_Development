using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApplicationCore.Domain
{
    public class Chambre
    {
        [Key]
        public int NumeroChambre { get; set; }
        public float Prix { get; set; }
        public TypeChambre TypeChambre { get; set; }


        public virtual IList<Admission> Admission { get; set; }
        public virtual Clinique Clinique { get; set; }
        public int CliniqueFk { get; set; }
    }
}
