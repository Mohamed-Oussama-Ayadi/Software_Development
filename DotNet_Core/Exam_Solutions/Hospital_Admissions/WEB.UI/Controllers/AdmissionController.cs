using ApplicationCore.Domain;
using ApplicationCore.Interfaces;
using ApplicationCore.Services;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;

namespace WEB.UI.Controllers
{
    public class AdmissionController : Controller
    {
        private readonly IAdmissionservice fp;
        


        public AdmissionController(IAdmissionservice fp)
        {
            this.fp = fp;
          
        }

        // GET: AdmissionController
        public ActionResult Index()
        {
            return View(fp.GetAll().OrderBy(h => h.DateAdmission));
        }

        // GET: AdmissionController/Details/5
        public ActionResult Details(int id)
        {
            return View();
        }

        // GET: AdmissionController/Create
        public ActionResult Create()
        {
            ViewBag.a = new SelectList(fp.GetAll(), "patientkey", "MyPatients.CIN");
            ViewBag.b = new SelectList(fp.GetAll(), "chambrekey", "MesChambres.NumeroChambre");
            return View();

        }

        // POST: AdmissionController/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(IFormCollection collection,Admission  a)
        {
            try
            {
                fp.Add(a);
                fp.Commit();

                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: AdmissionController/Edit/5
        public ActionResult Edit(int id)
        {
            return View();
        }

        // POST: AdmissionController/Edit/5
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

        // GET: AdmissionController/Delete/5
        public ActionResult Delete(int id)
        {
            return View();
        }

        // POST: AdmissionController/Delete/5
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
