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
    public class ProduitConfiguration : IEntityTypeConfiguration<Produit>
    {
        public void Configure(EntityTypeBuilder<Produit> builder)
        {
            //config many to many + chnage the name of the association table
            builder.HasMany(f => f.ListeFournisseurs)
                .WithMany(p => p.listeProduits)
                .UsingEntity(t => t.ToTable("Facture"));
        }
    }

}
