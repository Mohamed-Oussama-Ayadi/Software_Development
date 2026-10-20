using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApplicationCore.Domain
{
    public class Categorie
    {
        [Key]
        public int Code { get; set; }
        public String Libelle { get; set; }
        public virtual IList<livre> Livre { get; set; }


    }
}
