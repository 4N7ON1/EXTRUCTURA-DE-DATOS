package HITO2;

import java.util.Scanner;

public class MAIN2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("INGRESE DATOS DE PROVINCIAS");
        String nombreProvincia;
        int i, nProvincias;
        nProvincias = 2;

        System.out.println("INGRESE DATOS DE DEPARTAMENTOS");
        String nombreDepartamento;
        int j, nDepartamentos = 2;

        DEPARTAMENTO[] departamentos = new DEPARTAMENTO[100];

        for (j = 0; j < nDepartamentos; j = j + 1) {
            System.out.println("Ingrese el nombre del departamento " + (j + 1) + ": ");
            nombreDepartamento = leer.next();
            System.out.println("Ingrese el numero de provincias");

            PROVINCIA[] provincias = new PROVINCIA[100];

            for (i = 0; i < nProvincias; i = i + 1) {
                System.out.println("Ingrese el nombre de la provincia " + (i + 1) + ": ");
                nombreProvincia = leer.next();

                PROVINCIA prov = new PROVINCIA();
                prov.setNombre(nombreProvincia);

                provincias[i] = prov;
            }
            System.out.println("Ingrese el nombre de la nueva provincia: ");
            nombreProvincia = leer.next();

            PROVINCIA prov = new PROVINCIA();
            prov.setNombre(nombreProvincia);

            provincias[nProvincias] = prov;

            DEPARTAMENTO dep = new DEPARTAMENTO();
            dep.setNombre(nombreDepartamento);
            dep.setProvencias(provincias);
            dep.setNoProvincias(nProvincias + 1);
            departamentos[j] = dep;
        }

        System.out.println("Ingrese el nombre del nuevo departamento: ");
        nombreDepartamento = leer.next();

        DEPARTAMENTO dep = new DEPARTAMENTO();
        dep.setNombre(nombreDepartamento);

        departamentos[nDepartamentos] = dep;
        PAIS pais = new PAIS("BOLIVIA", nDepartamentos + 1, departamentos);
        pais.mostrarPais();

    }
}
