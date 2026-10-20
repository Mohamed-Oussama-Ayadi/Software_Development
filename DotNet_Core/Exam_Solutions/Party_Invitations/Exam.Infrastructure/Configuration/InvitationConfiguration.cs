using ApplicationCore.Domain;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Metadata.Builders;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam.Infrastructure.Configuration
{
    public class InvitationConfiguration : IEntityTypeConfiguration<Invitation>
    {
        public void Configure(EntityTypeBuilder<Invitation> builder)
        {
            builder
 .HasOne(r => r.MesInvites)
 .WithMany(p => p.Invitations)
 .HasForeignKey(r => r.InviteFk);

            builder
            .HasOne(r => r.Mesfete)
            .WithMany(f => f.Invitations)
           .HasForeignKey(r => r.FeteFk);
           
            builder.HasKey(r => new
            {
                r.DateInvitation,
                r.FeteFk,
                r.InviteFk
            });

        }
    }
}
