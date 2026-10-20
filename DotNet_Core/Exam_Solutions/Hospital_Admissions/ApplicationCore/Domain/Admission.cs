using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApplicationCore.Domain
{
    public class Admission
    {
        [DataType(DataType.Date)]
        public DateTime DateAdmission { get; set; }
        [DataType(DataType.MultilineText, ErrorMessage = "Le motif de l'admission")]
        public string Desciption { get; set; }

        public String MotifAdmission { get; set; }
        public int NbJours { get; set; }
        public virtual Patient MyPatients { get; set; }
        public virtual Chambre MesChambres { get; set; }
        public string patientkey { get; set; }
        //cle etrangere de sinstre donc doit avoir le meme type que cle primaire de sinstre et meme pour expert.
        public int chambrekey { get; set; }

    }
}
