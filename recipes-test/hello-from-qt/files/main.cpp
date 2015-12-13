#include <QCoreApplication>
#include <QTextStream>

int main(int argc, char *argv[])
{
	QCoreApplication a(argc, argv);
	QTextStream ts(stdout);
	ts << "hello from qt!" << endl;

	return 0;
}
