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
        public DbSet<Admission> admissions { get; set; }
        public DbSet<Chambre> chambres { get; set; }
        public DbSet<Clinique> cliniques { get; set; }
        public DbSet<Patient> patients { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseSqlServer(@"Data Source=(localdb)\mssqllocaldb;

             Initial Catalog=examclinique;Integrated Security=true;
                  MultipleActiveResultSets=true");
            optionsBuilder.UseLazyLoadingProxies();
            base.OnConfiguring(optionsBuilder);
        }
        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Patient>().OwnsOne(r => r.NomComplet, full =>
            {
                full.Property(p => p.Nom).HasMaxLength(30).HasColumnName("Nom");
                full.Property(p => p.prenom).IsRequired().HasColumnName("Prenom");

            });
            modelBuilder.ApplyConfiguration(new CliniqueConfig());
            modelBuilder.ApplyConfiguration(new AdmissionConfig());
        }
        protected override void ConfigureConventions(ModelConfigurationBuilder configurationBuilder)
        {
            base.ConfigureConventions(configurationBuilder);
        }
    }
}
