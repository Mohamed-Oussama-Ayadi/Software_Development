using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApplicationCore.Domain
{
    public class Patient
    {
        [EmailAddress]
        public string AdresseEmail { get; set; }
        [Key]
        public string CIN { get; set; }
        public DateTime DateNaissance { get; set; }
        public virtual NomComplet NomComplet { get; set; }
       // public string Nom { get; set; }
        public int NumDossir { get; set; }
        public int NumTel { get; set; }
        // public string Prenom { get; set; }
        public virtual IList<Admission> Admission { get; set; }
    }
}
