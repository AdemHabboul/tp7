public static void main(String[] args) {
		Ustensile[] us = new Ustensile[5];
		us[0] = new AssietteRonde(1926, 8.4);
		us[1] = new Cuillere(1881, 7.3); us[2]
		= new AssietteCarree(1935, 5.6); us[3]
		= new Cuillere(1917, 8.8); us[4] = new AssietteRonde(1837, 5.4);
		afficherCuilleres(us);
		afficherSurfaceAssiettes(us);
		afficherValeurTotale(us);
		}
		static void afficherCuilleres(Ustensile[] us) {
		int nbCuilleres = 0;
        for(int i=0;i<us.length;i++)
        {
            if (us[i] instanceof Cuillere)
            {
                nbCuilleres++;
            }
        }
		}
        
		System.out.println("il y a "+nbCuilleres+"cuilleres");
		}
		static void afficherSurfaceAssiettes(Ustensile[] us) {
		double somme = 0;
		for (int i = 0; i &lt; us.length; i++) {
                somme=somme+us[i].calculsurface();
            		}
		System.out.println("surface totale des assiettes est "+somme);
		}
		static void afficherValeurTotale(Ustensile[] us) {
		double s = 0;
		for (int i = 0; i &lt; us.length; i++) {
            s=s+us[i].calculvaleur()
		}
		System.out.println("valeur totale de la collection"+somme);
		}
