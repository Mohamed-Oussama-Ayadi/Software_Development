using ApplicationCore.Domain;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Metadata.Builders;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam.Infrastructure.configuration
{
    public class AdmissionConfig : IEntityTypeConfiguration<Admission>
    {
        public void Configure(EntityTypeBuilder<Admission> builder)
        {
            builder
           .HasOne(r => r.MesChambres)
           .WithMany(p => p.Admission)
           .HasForeignKey(r => r.chambrekey);

            builder
            .HasOne(r => r.MyPatients)
            .WithMany(f => f.Admission)
           .HasForeignKey(r => r.patientkey);
            //Pour la configuration complete de la classe Expertise il faut ajouter la clé primaire
            builder.HasKey(r => new
            {
                r.DateAdmission,
                r.chambrekey,
                r.patientkey
            });

        }
    }
}
