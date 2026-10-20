using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApplicationCore.Domain
{
    public enum Statut
    {
        Etudiant,Enseignant,Autre
    }
    public class Abonne
    {
        public int ID { get; set; }
        public String Nom { get; set; }
        public String Prenom { get; set; }
        public String Adresse { get; set; }
        public DateTime DateCreation { get; set; }
      
        public Statut statut  { get; set; }
        public virtual IList<pretLivre> PretLivres { get; set; }

    }

}
