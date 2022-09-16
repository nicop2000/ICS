public enum Modulnamen {
    GPM {
        @Override
        public String toString() {
            return "GPM - Grundlagen Projektmanagement";
        }
        @Override
        public Dozent dozent() {
            return Dozent.IMMEL;
        }
        @Override
        public String raum() {
            return "C02-0.06 / HS-6 IuE";
        }

        @Override
        public String abbrev() {
            return "GPM-VL";
        }
    },
    PIC {
        @Override
        public String toString() {
            return "PIC - Programmieren in C++";
        }
        @Override
        public Dozent dozent() {
            return Dozent.MANZKE;
        }
        @Override
        public String raum() {
            return "C08-0.01 / HS-1";
        }
        @Override
        public String abbrev() {
            return "PIC-VL";
        }
    },
    PICU {
        @Override
        public String toString() {
            return "PIC - Programmieren in C++ U";
        }
        @Override
        public Dozent dozent() {
            return Dozent.MANZKE;
        }
        @Override
        public String raum() {
            return "C22-0.01";
        }
        @Override
        public String abbrev() {
            return "PIC-Ü1";
        }
    },
    PICUL {
        @Override
        public String toString() {
            return "PIC - Programmieren in C++ ÜL";
        }
        @Override
        public Dozent dozent() {
            return Dozent.HANSEN;
        }
        @Override
        public String raum() {
            return "C12-2.70";
        }
        @Override
        public String abbrev() {
            return "PIC-ÜL1";
        }
    },
    SEG {
        @Override
        public String toString() {
            return "SEG - Software Engineering";
        }
        @Override
        public Dozent dozent() {
            return Dozent.PROCHNOW;
        }
        @Override
        public String raum() {
            return "C02-0.07 / HS-7 IuE";
        }
        @Override
        public String abbrev() {
            return "SEG-VL";
        }
    },
    SEGUL {
        @Override
        public String toString() {
            return "SEG - Software Engineering ÜL";
        }
        @Override
        public Dozent dozent() {
            return Dozent.HINKELMANN;
        }
        @Override
        public String raum() {
            return "C12-2.69";
        }
        @Override
        public String abbrev() {
            return "SEG-ÜL1";
        }
    },
    GHP {
        @Override
        public String toString() {
            return "GHP - Grundlagen hardwarenahe Programmierung";
        }
        @Override
        public Dozent dozent() {
            return Dozent.MANZKE;
        }
        @Override
        public String raum() {
            return "C08-0.01 / HS-1";
        }
        @Override
        public String abbrev() {
            return "GHP-VL";
        }
    },
    GPM_SA {
        @Override
        public String toString() {
            return "GPM - Grundlagen Projektmanagement";
        }
        @Override
        public Dozent dozent() {
            return Dozent.IMMEL;
        }
        @Override
        public String raum() {
            return "C18 Auditorium";
        }

        @Override
        public String abbrev() {
            return "GPM";
        }
    },
    GHPUL {
        @Override
        public String toString() {
            return "GHP - Grundlagen hardwarenahe Programmierung ÜL";
        }
        @Override
        public Dozent dozent() {
            return Dozent.KOSS;
        }
        @Override
        public String raum() {
            return "C13-1.13";
        }
        @Override
        public String abbrev() {
            return "GHP-ÜL1";
        }
    },
    AEM_SA {
        @Override
        public String toString() {
            return "AEM - Agile Entwicklungsmethoden";
        }
        @Override
        public Dozent dozent() {
            return Dozent.WOELK_RAEHSE;
        }
        @Override
        public String raum() {
            return "Auditorium";
        }
        @Override
        public String abbrev() {
            return "AEM-VL";
        }
    },
    AEM_DI {
        @Override
        public String toString() {
            return "AEM - Agile Entwicklungsmethoden";
        }
        @Override
        public Dozent dozent() {
            return Dozent.WOELK_RAEHSE;
        }
        @Override
        public String raum() {
            return "C13-3.02";
        }
        @Override
        public String abbrev() {
            return "AEM-VL";
        }
    },
    BI102 {
        @Override
        public String toString() {
            return "KI - Künstliche Intelligenz";
        }
        @Override
        public Dozent dozent() {
            return Dozent.PETERSEN;
        }
        @Override
        public String raum() {
            return "C12-2.61";
        }
        @Override
        public String abbrev() {
            return "BI102-VL";
        }
    },
    BI102UL {
        @Override
        public String toString() {
            return "KI - Künstliche Intelligenz ÜL";
        }
        @Override
        public Dozent dozent() {
            return Dozent.PETERSEN_EILERS;
        }
        @Override
        public String raum() {
            return "C12-2.61";
        }
        @Override
        public String abbrev() {
            return "BI102-ÜL";
        }
    },
    BI138 {
        @Override
        public String toString() {
            return "EITS - Einführung IT-Sicherheit";
        }
        @Override
        public Dozent dozent() {
            return Dozent.HANSEN;
        }
        @Override
        public String raum() {
            return "C12-2.61";
        }
        @Override
        public String abbrev() {
            return "BI138-EITS-VL";
        }
    },
    BI138UL {
        @Override
        public String toString() {
            return "EITS - Einführung IT-Sicherheit ÜL";
        }
        @Override
        public Dozent dozent() {
            return Dozent.HANSEN;
        }
        @Override
        public String raum() {
            return "C12-2.73";
        }
        @Override
        public String abbrev() {
            return "BI138-EITS-ÜL";
        }
    },
    NDBK {
        @Override
        public String toString() {
            return "NDBK - Neue Datenbankkonzepte";
        }
        @Override
        public Dozent dozent() {
            return Dozent.EHLERS;
        }
        @Override
        public String raum() {
            return "C02-0.12 / HS-12 IuE";
        }
        @Override
        public String abbrev() {
            return "NDBK-VL";
        }
    },
    NDBK_UL1 {
        @Override
        public String toString() {
            return "NDBK - Neue Datenbankkonzepte ÜL";
        }
        @Override
        public Dozent dozent() {
            return Dozent.EHLERS;
        }
        @Override
        public String raum() {
            return "C12-2.70";
        }
        @Override
        public String abbrev() {
            return "NDBK-ÜL1";
        }
    },
    IOT {
        @Override
        public String toString() {
            return "BK121 - Embedded Systems/Internet of Things-AG";
        }
        @Override
        public Dozent dozent() {
            return Dozent.PATZ_ACKER;
        }
        @Override
        public String raum() {
            return "C13-3.22";
        }
        @Override
        public String abbrev() {
            return "BK121";
        }
    },
    BK110 {
        @Override
        public String toString() {
            return "BK110 - Hardwarenahe Programmierung";
        }
        @Override
        public Dozent dozent() {
            return Dozent.ACKER;
        }
        @Override
        public String raum() {
            return "C13-0.04";
        }
        @Override
        public String abbrev() {
            return "BK110-VL";
        }
    },
    BK110_UL2 {
        @Override
        public String toString() {
            return "BK110 - Hardwarenahe Programmierung ÜL";
        }
        @Override
        public Dozent dozent() {
            return Dozent.ACKER_SCHWATLO;
        }
        @Override
        public String raum() {
            return "C13-3.18";
        }
        @Override
        public String abbrev() {
            return "BK110-ÜL2";
        }
    },
    XWIA {
        @Override
        public String toString() {
            return "XWIA - Wissenschaftliches Arbeiten";
        }
        @Override
        public Dozent dozent() {
            return Dozent.KOPKA_PATZ;
        }
        @Override
        public String raum() {
            return "C12-2.71";
        }
        @Override
        public String abbrev() {
            return "XWIA";
        }
    },
    ANF {
        @Override
        public String toString() {
            return "ANF - Anforderungsmanagement";
        }
        @Override
        public Dozent dozent() {
            return Dozent.LUSSEM;
        }
        @Override
        public String raum() {
            return "C02-0.06 H6";
        }
        @Override
        public String abbrev() {
            return "ANF-VL";
        }
    },
    ANF_UL1 {
        @Override
        public String toString() {
            return "ANF - Anforderungsmanagement ÜL";
        }
        @Override
        public Dozent dozent() {
            return Dozent.LUSSEM;
        }
        @Override
        public String raum() {
            return "C13-3.01";
        }
        @Override
        public String abbrev() {
            return "ANF-ÜL1";
        }
    },
    BI140 {
        @Override
        public String toString() {
            return "BI140 - Neben- und Parallelläufigkeit mit C++";
        }
        @Override
        public Dozent dozent() {
            return Dozent.GREVE;
        }
        @Override
        public String raum() {
            return "C12-2.61";
        }
        @Override
        public String abbrev() {
            return "BI140-VL";
        }
    },
    BI140_UL {
        @Override
        public String toString() {
            return "BI140 - Neben- und Parallelläufigkeit mit C++ ÜL";
        }
        @Override
        public Dozent dozent() {
            return Dozent.GREVE;
        }
        @Override
        public String raum() {
            return "C12-2.61";
        }
        @Override
        public String abbrev() {
            return "BI140-ÜL";
        }
    }
    ;

    public abstract String raum();
    public abstract String abbrev();
    public abstract Dozent dozent();
    }
