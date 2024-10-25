import java.lang.annotation.Annotation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@Tabela(value = "Modulo 19")
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("Main");
        for(Annotation annotation : clazz.getAnnotations()){
            String annotationName = annotation.annotationType().getName();
            System.out.println(annotationName);
        }

    }
}
