using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApplicationCore.Domain
{
    public class pretLivre
    {
        public DateTime DateDebut { get; set; }
        public DateTime DateFin { get; set; }
        public virtual livre MyLivre { get; set; }
        public virtual Abonne MyAbonne { get; set; }
        public int livreFK { get; set; }
      public int AbonneFK { get; set; }
       
        



    }
}
