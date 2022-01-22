package day41_Exceptions;

import day39_OOPrecap.LunchTask.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {

        Employee employee = null;

        try{
            System.out.println(employee.getSalary());
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Null point exception");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bounce");
            e.printStackTrace();
        }catch (ClassCastException e ){
            System.out.println("Class cast exception");
            e.printStackTrace();
        } catch (RuntimeException e){
            System.out.println("Runtime exception");
            e.printStackTrace();
        }finally {
            System.out.println("Finally summer");
        }

        System.out.println("Test completed");



    }
}
