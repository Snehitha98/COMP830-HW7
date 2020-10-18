package hw7;

public class AnimalClassTester {
	
	public boolean testAnimalObject(Object animal) {
		if (animal instanceof Cow) {
			Cow c = (Cow) animal;
			ExpectedCow ex = new ExpectedCow();
			if (c.aboutMe().equals(ex.expectedName())) {
				if (c.diet().equals(ex.expectedFood())) {
					if (c.produces().equals(ex.expectedInfo())) {
						return true;
					}
				}
			}
		} else if (animal instanceof Tyrannosaur) {
			Tyrannosaur t = (Tyrannosaur) animal;
			if (t.aboutMe().contentEquals("Tyrannosaurus Rex")) {
				if (t.roar().equalsIgnoreCase("Roarrr!")) {
					if (t.diet().equals("other dinosaurs")) {
						if(t.movement().contentEquals("walk")) {
							return true;
						}
					}
				}
			}
		} else if (animal instanceof Penguin) {
			Penguin p = (Penguin) animal;
			ExpectedPenguin ex = new ExpectedPenguin();
			if (p.aboutMe().equals(ex.expectedName())) {
				if (p.diet().equals(ex.expectedFood())) {
					if (p.movement().equalsIgnoreCase(ex.expectedmovement())) {
						return true;
					}
				}
			}
		}else if (animal instanceof TreeClimbingOctopus) {
			TreeClimbingOctopus t = (TreeClimbingOctopus) animal;
			if (t.aboutMe().equals("octopus")) {
				if (t.movement().equals("move")) {
					if (t.diet().equals("eggs")) {
						return true;
					}
				}
				
			}
		}
		return false;
	}

}
