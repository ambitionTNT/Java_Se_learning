// �﷨����
// javaֻ�����̳С��������̳С�java�Ǽ򵥵ġ�C++֧�ֶ��ؼ̳С�
// C++���ӽ���ʵһЩ����Ϊ����ʵ�����ж���ͬʱ�̳и�ĸ����������
/*
class E extends A, B
{
}
*/
class X
{
}
class Y extends X
{
}

class M extends Y
{
}

// ��ʵ��Ҳ˵����Z�Ǽ̳�X��Y�ġ�
// ����������Zֱ�Ӽ̳���Y��Z��Ӽ̳���X

class Z extends Y
{
}

/*

	Z�̳���Y
	Y�̳���X
	X�̳���Object

	Z�������Object��������������򣩡�

	Object��������ĳ��ࡣ�����ڡ�����ϵ�ṹ�еĸ���
	java��ô�Ӵ��һ���̳нṹ������ǣ�Object
*/