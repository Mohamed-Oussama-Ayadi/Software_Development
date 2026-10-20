using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApplicationCore.Domain
{
    public class livre
    {
        public int LivreID { get; set; }
        [Required]
        public String Isbn { get; set; }
        public String Titre { get; set; }
        public int NbrExemplaires { get; set; }
        public String Auteur { get; set; }
        [DataType(DataType.Date, ErrorMessage = "Please enter a valid date.")]
        public DateTime DateCreation { get; set; }
        public virtual IList<pretLivre> PretLivres { get; set; }
        public virtual Categorie MyCategorie { get; set; }

        public int CategorieFk { get; set; }
    }
}
