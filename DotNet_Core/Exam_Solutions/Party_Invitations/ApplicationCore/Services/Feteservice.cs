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
    public class Feteservice : Service<Fete>, IFeteservice
    {
        public Feteservice(IUnitOfWork unitOfWork) : base(unitOfWork)
        {
        }
    }
}
