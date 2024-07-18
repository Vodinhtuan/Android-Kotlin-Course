#include <iostream>
#include <string>

struct Human {
	std::string name;
	int age;
	float height;
	float weight;
	int temp[3];
};

std::string BMI(Human human) {
	float bmi = human.weight / (human.height * human.height);
	std::string result;
	if (bmi < 18.5)
	{
		result = "Thin";
	}
	else if (bmi > 25)
	{
		result = "Fat";
	}
	else
	{
		result = "Handsome";
	}
	//std::cout << "Your BMI: " << human.name << " is " << result << std::endl;
	return result;
}

void TheTime(Human human, int year) {
	for (int i = 0; i < year; i++)
	{
		human.height = human.weight + 2;
	}
	std::string result = BMI(human);
	std::cout << "Your BMI: " << human.name << " is " << result << " after " << year << std::endl;
}

int main() {
	Human human;
	human.name = "Tim";
	human.age = 18;
	human.height = 1.65;
	human.weight = 58;
	TheTime(human, 1);
	system("pause");
	return 0;
}