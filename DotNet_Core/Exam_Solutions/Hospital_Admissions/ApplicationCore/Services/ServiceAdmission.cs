using AM.ApplicationCore.Interfaces;
using AM.ApplicationCore.Services;
using ApplicationCore.Domain;
using ApplicationCore.Interfaces;
using Microsoft.EntityFrameworkCore.Metadata;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApplicationCore.Services
{
    public class ServiceAdmission : Service<Admission>, IAdmissionservice
    {
        public ServiceAdmission(IUnitOfWork unitOfWork) : base(unitOfWork)
        {
        }
    }
}
