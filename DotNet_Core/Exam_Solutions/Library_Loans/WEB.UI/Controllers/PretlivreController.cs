using ApplicationCore.Domain;
using ApplicationCore.Interfaces;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;

namespace WEB.UI.Controllers
{
    public class PretlivreController : Controller
    {

        private readonly IservicePretlivre pl;

        public PretlivreController(IservicePretlivre pl )
        {
            this.pl = pl;
        }

        // GET: PretlivreController
        public ActionResult Index(DateTime? dateDebut , DateTime? datefin)
        {
            if ((dateDebut == null)|| (datefin == null))
                return View(pl.GetAll().ToList());
            else
                return View(pl.GetMany(f => f.DateDebut.Date.Equals(dateDebut)
                && f.DateFin.Date.Equals(datefin)

                ).ToList());

            //    return View(pl.GetAll());
            
         }





            // GET: PretlivreController/Details/5
            public ActionResult Details(int id)
        {
            return View();
        }

        // GET: PretlivreController/Create
        public ActionResult Create()
        {
            ViewBag.MyLivre = new SelectList(pl.GetAll().ToList(),
                "livreFK", "MyLivre.Titre");
            ViewBag.MyAbonne = new SelectList(pl.GetAll().ToList(),
               "AbonneFK", "MyAbonne.Nom");

            return View();
        }

        // POST: PretlivreController/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(IFormCollection collection,pretLivre p)
        {
            try
            {
                pl.Add(p);
                pl.Commit();
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: PretlivreController/Edit/5
        public ActionResult Edit(int id)
        {
            return View();
        }

        // POST: PretlivreController/Edit/5
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

        // GET: PretlivreController/Delete/5
        public ActionResult Delete(int id)
        {
            return View();
        }

        // POST: PretlivreController/Delete/5
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
