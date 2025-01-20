package application;

import reflections.ProdutoReflection;
import reflections.ReflectionsClasses;
import annotations.ChavePrincipal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        //executeClasses();
        //executeConstructors();
        //executePropriedades();
        //executeMetodos();
        //executePackageInfo();
        //executeSuperClass();
        //executeInterface();
        executeLeituraAnotacao();

    }

    private static void executeLeituraAnotacao() {
        System.out.println("---------------x-----------");
        ProdutoReflection prod = new ProdutoReflection();
        Annotation[] annotations = prod.getClass().getAnnotations();
        for (Annotation an : annotations) {
            System.out.println("Annotation type: " + an.annotationType());
        }

        for (Field field : prod.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ChavePrincipal.class)) {
                ChavePrincipal ano = field.getAnnotation(ChavePrincipal.class);
                System.out.println("Nome: " + ano.toString());
                System.out.println("Valor: " + ano.value());
            }
        }


    }

    private static void executeInterface() {
        System.out.println("---------------x-----------");
        ProdutoReflection prod = new ProdutoReflection();
        Class<?>[] interfaces = prod.getClass().getInterfaces();
        for (Class cl : interfaces) {
            System.out.println("Nome interface: " + cl.getName());
        }
    }

    private static void executeSuperClass() {
        System.out.println("---------------x-----------");
        ProdutoReflection prod = new ProdutoReflection();
        System.out.println("Nome super class: " + prod.getClass().getSuperclass().getName());
    }

    private static void executePackageInfo() {
        System.out.println("---------------x-----------");
        ProdutoReflection prod = new ProdutoReflection();
        System.out.println("Nome completo: " + prod.getClass().getPackage());
        System.out.println("Nome: " + prod.getClass().getName());

    }

    private static void executeMetodos() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("---------------x-----------");
        ProdutoReflection prod = new ProdutoReflection();
        Method[] methods = prod.getClass().getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Nome completo: " + m);
            System.out.println("Nome: " + m.getName());
            System.out.println("Tipo: " + m.getReturnType());
            System.out.println();
        }
        Method methodGet = prod.getClass().getMethod("getNome");
        System.out.println("Pegando método pelo nome: " + methodGet.getName());

        Method methodSet = prod.getClass().getMethod("setNome", String.class);
        System.out.println("Pegando método pelo nome: " + methodSet.getName());

        methodSet.invoke(prod, "Jhonathan");
        System.out.println("Invocando (get) valor do nome: " + methodGet.invoke(prod));

    }

    private static void executePropriedades() {
        System.out.println("---------------x-----------");
        ProdutoReflection prod = new ProdutoReflection();
        Field[] fields = prod.getClass().getDeclaredFields();
        for (Field f : fields) {
            System.out.println("Nome completo: " + f);
            System.out.println("Nome: " + f.getName());
            System.out.println("Tipo: " + f.getType());
            System.out.println();
        }
    }

    private static void executeConstructors() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        System.out.println("---------------x-----------");
        Class prodC = ProdutoReflection.class;
        System.out.println(prodC);

        Constructor con = prodC.getConstructor();
        System.out.println(con);

        ProdutoReflection prod = (ProdutoReflection) con.newInstance();
        System.out.println(prod);

        Constructor con1 = prodC.getConstructor(Long.class);
        System.out.println(con1);
        ProdutoReflection prod1 = (ProdutoReflection) con1.newInstance(10L);
        System.out.println(prod1 + " valor: " + prod1.getCodigo());

        Constructor[] constructors = prodC.getDeclaredConstructors();
        System.out.println("Construtores declarados:");
        for (Constructor c : constructors) {
            System.out.println(c);
        }

    }

    private static void executeClasses() throws ClassNotFoundException {
        System.out.println("---------------x-----------");
        Class c1 = boolean.class;
        System.out.println(c1);

        Class c2 = java.io.PrintStream.class;
        System.out.println(c2);

        Class c = Class.forName("reflections.ReflectionsClasses");
        System.out.println(c);

        System.out.println(ReflectionsClasses.class);
        System.out.println(ReflectionsClasses.class.getSimpleName());
        System.out.println(ReflectionsClasses.class.getName());
    }
}