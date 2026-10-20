using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApplicationCore.Domain
{
    public class Clinique
    {
        public string Adresse { get; set; }
        public int Capacite { get; set; }
        [Key]
        public int CliniqueID { get; set; }
        public int NumTel { get; set; }
        public virtual IList<Chambre> Chambre { get; set; }
    }
}
