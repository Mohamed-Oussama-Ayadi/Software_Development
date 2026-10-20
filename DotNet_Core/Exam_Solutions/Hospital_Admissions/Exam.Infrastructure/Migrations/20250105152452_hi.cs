using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace Exam.Infrastructure.Migrations
{
    /// <inheritdoc />
    public partial class hi : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "cliniques",
                columns: table => new
                {
                    CliniqueID = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Adresse = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Capacite = table.Column<int>(type: "int", nullable: false),
                    NumTel = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_cliniques", x => x.CliniqueID);
                });

            migrationBuilder.CreateTable(
                name: "patients",
                columns: table => new
                {
                    CIN = table.Column<string>(type: "nvarchar(450)", nullable: false),
                    AdresseEmail = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DateNaissance = table.Column<DateTime>(type: "datetime2", nullable: false),
                    Prenom = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Nom = table.Column<string>(type: "nvarchar(30)", maxLength: 30, nullable: false),
                    NumDossir = table.Column<int>(type: "int", nullable: false),
                    NumTel = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_patients", x => x.CIN);
                });

            migrationBuilder.CreateTable(
                name: "chambres",
                columns: table => new
                {
                    NumeroChambre = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Prix = table.Column<float>(type: "real", nullable: false),
                    TypeChambre = table.Column<int>(type: "int", nullable: false),
                    CliniqueFk = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_chambres", x => x.NumeroChambre);
                    table.ForeignKey(
                        name: "FK_chambres_cliniques_CliniqueFk",
                        column: x => x.CliniqueFk,
                        principalTable: "cliniques",
                        principalColumn: "CliniqueID",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "admissions",
                columns: table => new
                {
                    DateAdmission = table.Column<DateTime>(type: "datetime2", nullable: false),
                    patientkey = table.Column<string>(type: "nvarchar(450)", nullable: false),
                    chambrekey = table.Column<int>(type: "int", nullable: false),
                    Desciption = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MotifAdmission = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    NbJours = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_admissions", x => new { x.DateAdmission, x.chambrekey, x.patientkey });
                    table.ForeignKey(
                        name: "FK_admissions_chambres_chambrekey",
                        column: x => x.chambrekey,
                        principalTable: "chambres",
                        principalColumn: "NumeroChambre",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_admissions_patients_patientkey",
                        column: x => x.patientkey,
                        principalTable: "patients",
                        principalColumn: "CIN",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_admissions_chambrekey",
                table: "admissions",
                column: "chambrekey");

            migrationBuilder.CreateIndex(
                name: "IX_admissions_patientkey",
                table: "admissions",
                column: "patientkey");

            migrationBuilder.CreateIndex(
                name: "IX_chambres_CliniqueFk",
                table: "chambres",
                column: "CliniqueFk");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "admissions");

            migrationBuilder.DropTable(
                name: "chambres");

            migrationBuilder.DropTable(
                name: "patients");

            migrationBuilder.DropTable(
                name: "cliniques");
        }
    }
}
