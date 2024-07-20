#include <iostream>
#include <string>
struct Human
{
	Human(std::string n, int a, float w, float h) {
		name = n;
		age = a;
		weight = w;
		height = h;
		ss = true;
	}
	virtual std::string dday() { // virtual means calling the override function in the classes that inherit it
		return "Normandy";
	}
	int age;
	float weight;
	float height;
	std::string name;
	bool ss;
};

struct subHuman : public Human
{
	subHuman(std::string n, int a, float w, float h) : Human(n, a, w, h) {

	}

	std::string dday() {
		return "Overlord";
	}
	
};

void check(Human * human) {
	human->ss = false;
	std::cout << "Check human: " << human->name << " Follow by " << human->dday() << std::endl;
}

int main() {
	Human * team[5] = {
		new Human("human1", 23, 45, 1.65),
		new subHuman("human2", 27, 46, 1.75),
		new Human("human3", 28, 47, 1.85),
		new subHuman("human4", 29, 50, 1.55),
		new Human("human5", 30, 49, 1.72),
	};
	
	/*std::cout << "Before check: " << team[1].name << " " << (team[1].ss ? "true" : "false") << std::endl;
	check(team[1]);*/

	Human* human;
	for (int i = 0; i < 5; i++) {
		human = team[i];
		check(human);
	}
	// Array
	//for (int i = 0; i < 5; i++)
	//{
	//	check(team[i]);
	//	std::cout << team[i].name << std::endl;
	//}
	/*Human *tim = nullptr;
	for (tim = team; tim < team + 5 ; tim++)
	{
		std::cout << (*tim).name << std::endl;
	}*/

	/*std::cout << &human1 << std::endl;
	std::cout << &human2 << std::endl;
	std::cout << &human3 << std::endl;*/
	
	//Human *tim = &human1; // copy data
	//Human *finn = nullptr; // null

	/*tim = &human1;
	human1.age = 24;*/

	//tim = tim + 1;

	//std::cout << (*tim).age << std::endl;

	return 0;
}