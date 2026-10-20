using AM.ApplicationCore.Interfaces;
using AM.ApplicationCore.Services;
using ApplicationCore.Domain;
using ApplicationCore.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApplicationCore.Services
{
    public class Invitationservice : Service<Invitation>, Iinvitationservice
    {
        public Invitationservice(IUnitOfWork unitOfWork) : base(unitOfWork)
        {
        }
    }
}
