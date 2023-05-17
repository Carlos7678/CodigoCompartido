/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Eduardo Silvestre
 */
public class FiguresMeues {

    private HashSet<Figura> figures;

    public FiguresMeues() {
        figures = new HashSet<>();
    }

    public void afegir(Figura figura) {
        figures.add(figura);
    }

    @Override
    public String toString() {
        return figures.toString();
    }

    public String llistatTotal() {
        return llistarTot(figures);
    }

    private String llistarTot(Collection<Figura> coleccio) {
        String llistat = "Llistat total\n---------------------------------------------------\n";
        for (Figura figura : coleccio) {
            llistat += figura.getTextComplet() + "\n";
        }

        return llistat;
    }

    public void afegirAleatori() {
        int nf = 10;
        while (nf > 0) {
            int tipus = (int) (Math.random() * 3);
            int x = -10 + (int) (Math.random() * 21);
            int y = -10 + (int) (Math.random() * 21);
            Figura f = switch (tipus) {
                case 0 ->
                    new Cercle(Math.random() * 10, x, y);
                case 1 ->
                    new Rectangle(Math.random() * 10, Math.random() * 10, x, y);
                default ->
                    new Quadrat(Math.random() * 10, x, y);
            };
            if (figures.add(f)) {
                nf--;
            }
        }

    }

    public String getAreaMaxMin() {
        if (figures.isEmpty()) {
            return "No hi ha cap figura";
        }
        List<Figura> lf = new ArrayList<>(figures);
        Collections.sort(lf, new PerArea());
//        lf.sort((o1,o2)->Double.compare(o1.getArea(), o2.getArea()));
        Figura min = lf.get(0);
        String txt = "Els mínims són:\n";
        for (int i = 0; i < lf.size()
                && lf.get(i).getArea() == min.getArea(); i++) {
            txt += lf.get(i).getTextComplet() + "\n";
        }

        Figura max = lf.get(lf.size() - 1);
        txt += "Els màxims són:\n";
        for (int i = lf.size() - 1; i >= 0 && lf.get(i).getArea() == max.getArea(); i--) {
            txt += lf.get(i).getTextComplet() + "\n";
        }
        return txt;
    }

    public String getDistanciesA(Punt punt) {
        String llistat = "Distàncies de les figures a "
                + punt
                + "\n---------------------------------------------------\n";
        for (Figura figura : figures) {
            llistat += figura.getDistanciaA(punt) + "\n";
        }

        return llistat;
    }

    public String getDistanciesFigures() {
        String llistat = String.format("%16s", "|");
        for (Figura figura : figures) {
            llistat += String.format("%15s|", figura.getTextCurt());
        }
        llistat += "\n";
        for (Figura figura : figures) {
            llistat += String.format("%15s|", figura.getTextCurt());
            for (Figura figure : figures) {
                llistat += String.format("%15.2f|", Mesurador.getDistancia(figura, figure));
            }
            llistat += "\n";
        }
        return llistat + "\n";
    }

    public String ordenaPerArea() {
        List<Figura> lf = new ArrayList<>(figures);
        lf.sort((o1, o2) -> Double.compare(o1.getArea(), o2.getArea()));
        return llistarTot(lf);
    }

    public String ordenaPerPerimetre() {
        List<Figura> lf = new ArrayList<>(figures);
//        lf.sort((o1, o2) -> Double.compare(o2.getPerimetre(), o1.getPerimetre()));
        Collections.sort(lf, new PerPerimetre().reversed());
        return llistarTot(lf);
    }

    public void eliminaTotes() {
        figures.clear();
    }

    public boolean eliminaFiguraEn(Punt p) {
        Cercle c = new Cercle(0);
        c.setPosicio(p);
        return figures.remove(c);
    }

    public void eliminaFigures(String tipus) {
        if (tipus.equalsIgnoreCase("cercle")) {
            for (Iterator<Figura> iterator = figures.iterator(); iterator.hasNext();) {
                if (iterator.next() instanceof Cercle) {
                    iterator.remove();
                }
            }
        } else if (tipus.equalsIgnoreCase("quadrat")) {
            for (Iterator<Figura> iterator = figures.iterator(); iterator.hasNext();) {
                if (iterator.next() instanceof Quadrat) {
                    iterator.remove();
                }
            }
        } else if (tipus.equalsIgnoreCase("rectangle")) {
            for (Iterator<Figura> iterator = figures.iterator(); iterator.hasNext();) {
                Figura f = iterator.next();
                if (f instanceof Rectangle
                        && !(f instanceof Quadrat)) {
                    iterator.remove();
                }
            }
        }

//        tipus = tipus.toLowerCase();
//        switch (tipus) {
//            case "quadrat":
//                for (Iterator<Figura> iterator = figures.iterator(); iterator.hasNext();) {
//                    if (iterator.next().getClass() == Quadrat.class) {
//                        iterator.remove();
//                    }
//                }
//                break;
//            case "rectangle":
//                for (Iterator<Figura> iterator = figures.iterator(); iterator.hasNext();) {
//                    if (iterator.next().getClass() == Rectangle.class) {
//                        iterator.remove();
//                    }
//                }
//                break;
//            case "cercle":
//                for (Iterator<Figura> iterator = figures.iterator(); iterator.hasNext();) {
//                    if (iterator.next().getClass() == Cercle.class) {
//                        iterator.remove();
//                    }
//                }
//                break;
//        }

//        Class<?> classeB;
//        switch (tipus) {
//            case "quadrat":
//                classeB = Quadrat.class;
//                break;
//            case "rectangle":
//                classeB = Rectangle.class;
//                break;
//            case "cercle":
//                classeB = Cercle.class;
//                break;
//            default:
//                return;
//        }
//        for (Iterator<Figura> iterator = figures.iterator(); iterator.hasNext();) {
//            if (iterator.next().getClass() == classeB) {
//                iterator.remove();
//            }
//        }

    }

    public String sumaDeArees() {
        double suma = 0;
        
        for (Figura figura : figures) {
            suma += figura.getArea();
        }
        
        return String.format("La suma de les àrees de les figures és %.2f\n", suma);
    }

    public String sumaPerimetres() {
        double suma = 0;
        
        for (Figura figura : figures) {
            if (figura instanceof Rectangle) {
                suma += figura.getPerimetre();
            }
        }
        
        return String.format("La suma dels perímetres de les figures és %.2f\n", suma);
    
    }
}
