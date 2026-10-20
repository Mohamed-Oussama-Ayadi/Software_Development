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
    public class PretLivreconfiguratin : IEntityTypeConfiguration<pretLivre>
    {
        public void Configure(EntityTypeBuilder<pretLivre> builder)
        {

            builder
.HasOne(r => r.MyLivre)
.WithMany(p => p.PretLivres)
.HasForeignKey(r => r.livreFK);

            builder
            .HasOne(r => r.MyAbonne)
            .WithMany(f => f.PretLivres)
           .HasForeignKey(r => r.AbonneFK);
            //Pour la configuration complete de la classe Expertise il faut ajouter la clé primaire
            builder.HasKey(r => new
            {
                r.AbonneFK,
                r.livreFK,
                r.DateDebut

            });
        }

       

    }
}

