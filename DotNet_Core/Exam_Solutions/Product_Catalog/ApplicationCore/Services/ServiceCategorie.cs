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
    public class ServiceCategorie : Service<Categorie>, ICategorie
    {
        public ServiceCategorie(IUnitOfWork unitOfWork) : base(unitOfWork)
        {
        }
    }
}
