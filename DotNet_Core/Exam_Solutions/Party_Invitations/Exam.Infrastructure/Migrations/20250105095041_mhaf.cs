using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace Exam.Infrastructure.Migrations
{
    /// <inheritdoc />
    public partial class mhaf : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Invites",
                columns: table => new
                {
                    InviteID = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Nom = table.Column<string>(type: "nvarchar(150)", maxLength: 150, nullable: false),
                    Prenom = table.Column<string>(type: "nvarchar(150)", maxLength: 150, nullable: false),
                    DateNaissance = table.Column<DateTime>(type: "datetime2", nullable: false),
                    AdresseInvite = table.Column<string>(type: "nvarchar(150)", maxLength: 150, nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Invites", x => x.InviteID);
                });

            migrationBuilder.CreateTable(
                name: "salles",
                columns: table => new
                {
                    SalleID = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    NomSalle = table.Column<string>(type: "nvarchar(150)", maxLength: 150, nullable: false),
                    AdresseSalle = table.Column<string>(type: "nvarchar(150)", maxLength: 150, nullable: false),
                    Capacite = table.Column<int>(type: "int", nullable: false),
                    PrixParHeure = table.Column<double>(type: "float", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_salles", x => x.SalleID);
                });

            migrationBuilder.CreateTable(
                name: "Fetes",
                columns: table => new
                {
                    FeteID = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Description = table.Column<string>(type: "nvarchar(150)", maxLength: 150, nullable: false),
                    NbInvitesMax = table.Column<int>(type: "int", nullable: false),
                    Duree = table.Column<int>(type: "int", nullable: false),
                    DateFete = table.Column<DateTime>(type: "datetime2", nullable: false),
                    Type = table.Column<int>(type: "int", nullable: false),
                    SalleID = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Fetes", x => x.FeteID);
                    table.ForeignKey(
                        name: "FK_Fetes_salles_SalleID",
                        column: x => x.SalleID,
                        principalTable: "salles",
                        principalColumn: "SalleID",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "Invitations",
                columns: table => new
                {
                    DateInvitation = table.Column<DateTime>(type: "datetime2", nullable: false),
                    FeteFk = table.Column<int>(type: "int", nullable: false),
                    InviteFk = table.Column<int>(type: "int", nullable: false),
                    ConfirmeInvitation = table.Column<bool>(type: "bit", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Invitations", x => new { x.DateInvitation, x.FeteFk, x.InviteFk });
                    table.ForeignKey(
                        name: "FK_Invitations_Fetes_FeteFk",
                        column: x => x.FeteFk,
                        principalTable: "Fetes",
                        principalColumn: "FeteID",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_Invitations_Invites_InviteFk",
                        column: x => x.InviteFk,
                        principalTable: "Invites",
                        principalColumn: "InviteID",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_Fetes_SalleID",
                table: "Fetes",
                column: "SalleID");

            migrationBuilder.CreateIndex(
                name: "IX_Invitations_FeteFk",
                table: "Invitations",
                column: "FeteFk");

            migrationBuilder.CreateIndex(
                name: "IX_Invitations_InviteFk",
                table: "Invitations",
                column: "InviteFk");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Invitations");

            migrationBuilder.DropTable(
                name: "Fetes");

            migrationBuilder.DropTable(
                name: "Invites");

            migrationBuilder.DropTable(
                name: "salles");
        }
    }
}
