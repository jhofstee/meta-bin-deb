#include <iostream>

using namespace std;

int main()
{
	try {
		throw "something";
	} catch (...) {
		cout << "hello from cpp" << endl;
	}

	return 0;
}
