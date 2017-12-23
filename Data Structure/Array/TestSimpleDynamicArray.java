public class TestSimpleDynamicArray {
	
	
	public static void main(String[] args) {
		SimpleDynamicArray<String> animalArray = new SimpleDynamicArray<>(String.class,10);
		System.out.println(animalArray);
		System.out.println("The size of array is " + animalArray.getSize() + ".");
		System.out.println("The array is empty? " + animalArray.isEmpty() + ".");
		animalArray.remove();
		animalArray.removeByIndex(0);
		animalArray.getValueByIndex(0);
		animalArray.searchByValue("Tiger");
		animalArray.editByIndex(0, "Frog");
		System.out.println();
		
		
		animalArray.addValue("Dog");
		animalArray.addValue("Cat");
		animalArray.addValue("Frog");
		animalArray.addValue("Lion");
		animalArray.addValue("Rabbit");

		System.out.println(animalArray);
		animalArray.addValueByIndex(3, "Horse");
		System.out.println(animalArray);
		System.out.println("The size of array is " + animalArray.getSize() + ".");
		System.out.println("The array is empty? " + animalArray.isEmpty() + ".");
		animalArray.removeByIndex(0);
		System.out.println(animalArray);
		animalArray.remove();
		System.out.println(animalArray);
		animalArray.getValueByIndex(8);
		animalArray.searchByValue("Tiger");
		animalArray.editByIndex(0, "Bear");
		System.out.println(animalArray);
		System.out.println();
		
		animalArray.addValue("Dog");
		animalArray.addValue("Bee");
		animalArray.addValue("Bird");
		animalArray.addValue("Rat");
		animalArray.addValue("Butterfly");
		animalArray.addValue("Rhino");
		animalArray.addValue("Pig");
		System.out.println(animalArray);
		animalArray.getValueByIndex(8);
		animalArray.getValueByIndex(12);
		animalArray.searchByValue("Lion");
		animalArray.editByIndex(12, "Snake");
		animalArray.removeByIndex(9);
		animalArray.removeByIndex(9);
		System.out.println(animalArray);
		
	}		
}
