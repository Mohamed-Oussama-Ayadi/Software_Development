using AM.ApplicationCore.Interfaces;
using ApplicationCore.Domain;
using Microsoft.EntityFrameworkCore.Metadata;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApplicationCore.Interfaces
{
    public interface IAdmissionservice : IService<Admission>
    {
    }
}
