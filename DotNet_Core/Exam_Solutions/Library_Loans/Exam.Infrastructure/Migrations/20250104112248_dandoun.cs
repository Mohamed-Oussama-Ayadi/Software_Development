using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace Exam.Infrastructure.Migrations
{
    /// <inheritdoc />
    public partial class dandoun : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Abonnes",
                columns: table => new
                {
                    ID = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Nom = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Prenom = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Adresse = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DateCreation = table.Column<DateTime>(type: "datetime2", nullable: false),
                    statut = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Abonnes", x => x.ID);
                });

            migrationBuilder.CreateTable(
                name: "Categories",
                columns: table => new
                {
                    Code = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Libelle = table.Column<string>(type: "nvarchar(max)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Categories", x => x.Code);
                });

            migrationBuilder.CreateTable(
                name: "livres",
                columns: table => new
                {
                    LivreID = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Isbn = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Titre = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    NbrExemplaires = table.Column<int>(type: "int", nullable: false),
                    Auteur = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DateCreation = table.Column<DateTime>(type: "datetime2", nullable: false),
                    CategorieFk = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_livres", x => x.LivreID);
                    table.ForeignKey(
                        name: "FK_livres_Categories_CategorieFk",
                        column: x => x.CategorieFk,
                        principalTable: "Categories",
                        principalColumn: "Code",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "pretLivres",
                columns: table => new
                {
                    DateDebut = table.Column<DateTime>(type: "datetime2", nullable: false),
                    livreFK = table.Column<int>(type: "int", nullable: false),
                    AbonneFK = table.Column<int>(type: "int", nullable: false),
                    DateFin = table.Column<DateTime>(type: "datetime2", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_pretLivres", x => new { x.AbonneFK, x.livreFK, x.DateDebut });
                    table.ForeignKey(
                        name: "FK_pretLivres_Abonnes_AbonneFK",
                        column: x => x.AbonneFK,
                        principalTable: "Abonnes",
                        principalColumn: "ID",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_pretLivres_livres_livreFK",
                        column: x => x.livreFK,
                        principalTable: "livres",
                        principalColumn: "LivreID",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_livres_CategorieFk",
                table: "livres",
                column: "CategorieFk");

            migrationBuilder.CreateIndex(
                name: "IX_pretLivres_livreFK",
                table: "pretLivres",
                column: "livreFK");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "pretLivres");

            migrationBuilder.DropTable(
                name: "Abonnes");

            migrationBuilder.DropTable(
                name: "livres");

            migrationBuilder.DropTable(
                name: "Categories");
        }
    }
}
