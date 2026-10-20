using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApplicationCore.Domain
{
    public class Produit
    {
        [DataType(DataType.Date, ErrorMessage = "Please enter a valid date.")]
        public DateTime DateProd { get; set; }
        public string Destination { get; set; }
        public string Nom { get; set; }
        public double Price { get; set; }
        public int ProduitID { get; set; }
        [ForeignKey("MyCategorie")]
        public int CategorieFK { get; set; }


        public virtual Categorie MyCategorie { get; set; }
 
   

        public virtual IList<Fournisseur> ListeFournisseurs { get; set; }
    }
}
