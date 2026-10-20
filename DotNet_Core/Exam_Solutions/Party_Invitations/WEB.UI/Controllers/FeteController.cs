using ApplicationCore.Interfaces;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace WEB.UI.Controllers
{
    public class FeteController : Controller
    {
        readonly IFeteservice s;
        public FeteController(IFeteservice s)
        {
            this.s = s;

        }

        // GET: FeteController
        /* public ActionResult Index()
         {
             return View(s.GetAll().OrderBy(h => h.DateFete));
         }*/
        public ActionResult Index(DateTime? DateFete)
        {
            if (DateFete == null)
                return View(s.GetAll().ToList());
            else
                return View(s.GetMany(f => f.DateFete.Date.Equals(DateFete)).ToList());
        }



        // GET: FeteController/Details/5
        public ActionResult Details(int id)
        {
            return View();
        }

        // GET: FeteController/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: FeteController/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(IFormCollection collection)
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

        // GET: FeteController/Edit/5
        public ActionResult Edit(int id)
        {
            return View();
        }

        // POST: FeteController/Edit/5
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

        // GET: FeteController/Delete/5
        public ActionResult Delete(int id)
        {
            return View();
        }

        // POST: FeteController/Delete/5
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
