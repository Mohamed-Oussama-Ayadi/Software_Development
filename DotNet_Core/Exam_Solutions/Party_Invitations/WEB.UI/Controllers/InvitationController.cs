using AM.ApplicationCore.Interfaces;
using ApplicationCore.Domain;
using ApplicationCore.Interfaces;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using System.Numerics;

namespace WEB.UI.Controllers
{
    public class InvitationController : Controller
    {      readonly Iinvitationservice ps;
        public InvitationController(Iinvitationservice ps)
        {
            this.ps = ps;

        }


        // GET: InvitationController
        public ActionResult Index()
        {
            return View(ps.GetAll().OrderBy(h => h.Mesfete.DateFete));
        }

        // GET: InvitationController/Details/5
        public ActionResult Details(int id)        {
            return View();
        }

        // GET: InvitationController/Create
        public ActionResult Create()
        {
            ViewBag.a = new SelectList(ps.GetAll(), "FeteFk", "Mesfete.Description");
            ViewBag.b = new SelectList(ps.GetAll(), "InviteFk", "MesInvites.Nom");

            return View();
        }

        // POST: InvitationController/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(IFormCollection collection,Invitation p)
        {
            try
            {
                ps.Add(p);
                ps.Commit();
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: InvitationController/Edit/5
        public ActionResult Edit(int id)
        {
            return View();
        }

        // POST: InvitationController/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int id, IFormCollection collection)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: InvitationController/Delete/5
        public ActionResult Delete(int id)
        {
            return View();
        }

        // POST: InvitationController/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id, IFormCollection collection)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }
    }
}
