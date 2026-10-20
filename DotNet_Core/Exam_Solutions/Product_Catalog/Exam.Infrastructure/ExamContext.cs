using ApplicationCore.Domain;
using Exam.Infrastructure.configuration;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam.Infrastructure
{

    public class ExamContext: DbContext
    {
        public DbSet<Produit> Produits { get; set; }
        public DbSet<Categorie> Categories { get; set; }
        public DbSet<Fournisseur> fournisseurs { get; set; }
        public DbSet<Chimique> chimiques { get; set; }
        public DbSet<Biologique> biologiques { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseSqlServer(@"Data Source=(localdb)\mssqllocaldb;

             Initial Catalog=ons;Integrated Security=true;
                  MultipleActiveResultSets=true");
            optionsBuilder.UseLazyLoadingProxies();
            base.OnConfiguring(optionsBuilder);
        }
        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {//inheritence TPH (Table per hierarchy)
            modelBuilder.Entity<Produit>()
                .HasDiscriminator<string>("TypeProduit")
                .HasValue<Chimique>("C")
                .HasValue<Biologique>("B")
                .HasValue<Produit>("P");
            modelBuilder.ApplyConfiguration(new ProduitConfiguration());
            base.OnModelCreating(modelBuilder);
        }
        protected override void ConfigureConventions(ModelConfigurationBuilder configurationBuilder)
        {
            configurationBuilder.Properties<string>().HaveMaxLength(50);
            base.ConfigureConventions(configurationBuilder);
        }
    }
}
