package medium;

import java.util.Arrays;

public class BirthdayCake {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(birthdayArranger("Jack", 9)));
	}

	public static String[] birthdayArranger(String name, int number) {

		String[] emptyArray = {};
		if (name == null) {

			return emptyArray;
		}

		String[] array = new String[3];
		array[0] = "";
		array[2] = "";

		if (number % 2 == 0) {

			array[1] = "# " + number + " Happy Birthday " + name + "! " + number + " #";
			for (int i = 0; i < array[1].length(); i++) {

				array[0] = array[0] + "#";
				array[2] = array[2] + "#";
			}

			return array;
		}

		array[1] = "* " + number + " Happy Birthday " + name + "! " + number + " *";
		for (int j = 0; j < array[1].length(); j++) {

			array[0] = array[0] + "*";
			array[2] = array[2] + "*";
		}

		return array;
	}
}
