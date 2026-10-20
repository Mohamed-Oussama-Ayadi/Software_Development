using ApplicationCore.Domain;
using ApplicationCore.Interfaces;
using ApplicationCore.Services;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;

namespace WEB.UI.Controllers
{
    public class ProduitController : Controller
    {
        private readonly IProduitservice p;

        public ProduitController(IProduitservice p)
        {
            this.p = p;
        }

        // GET: ProduitController
       
            public ActionResult Index(String? nom)
            {
                if (nom == null)
                    return View(p.GetAll().ToList());
                else
                    return View(p.GetMany(f => f.Nom.Equals(nom)).ToList());
            }

         
            
        

        // GET: ProduitController/Details/5
        public ActionResult Details(int id)
        {
            return View();
        }

        // GET: ProduitController/Create
        public ActionResult Create()
        {
            //ViewBag.planeList = new SelectList(ps.GetAll(), "PlaneId", "Flight.PlaneId");
            //ViewBag.a = new SelectList(p.GetAll(), "ID", "Nom");
            return View();
        }

        // POST: ProduitController/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(IFormCollection collection,Produit pr , IFormFile Destination)
        {
            try
            {
                {
                    if (Destination != null)
                    {
                        var path = Path.Combine(Directory.GetCurrentDirectory(), "wwwroot", "uploads", Destination.FileName);
                        Stream stream = new FileStream(path, FileMode.Create);
                        Destination.CopyTo(stream);
                        pr.Destination = Destination.FileName;
                    }




                    p.Add(pr);
                    p.Commit();
                }
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: ProduitController/Edit/5
        public ActionResult Edit(int id)
        {
            return View(p.GetById(id));
        }

        // POST: ProduitController/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int id, IFormCollection collection,Produit a)
        {
            try
            {
                a.ProduitID = id;
                p.Update(a);
                p.Commit();
                return RedirectToAction(nameof(Index));
            }

            catch
            {
                return View();
            }
        }

        // GET: ProduitController/Delete/5
        public ActionResult Delete(int id)
        {
            return View(p.GetById(id));
        }

        // POST: ProduitController/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id, IFormCollection collection)
        {
            try
            {
                Produit f = p.GetById(id);
                p.Delete(f);
                p.Commit();
                return RedirectToAction(nameof(Index));
               
            }
            catch
            {
                return View();
            }
        }
    }
}
