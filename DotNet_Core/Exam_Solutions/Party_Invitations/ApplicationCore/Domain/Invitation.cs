using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApplicationCore.Domain
{
    public class Invitation
    {
        public DateTime DateInvitation { get; set; }
        public bool ConfirmeInvitation { get; set; }

        public virtual Invite MesInvites { get; set; }
        public virtual Fete Mesfete { get; set; }
      
        public int FeteFk { get; set; }
        public int InviteFk { get; set; }

    }
}
