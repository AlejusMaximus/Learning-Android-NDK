#include <jni.h>
#include <com_alejus_hellondk_MainActivity.h>

jint JNICALL Java_com_alejus_hellondk_MainActivity_suma(JNIEnv *env,
		jobject obj, jint numero1, jint numero2) {
	return numero1 + numero2;
}

jint JNICALL Java_com_alejus_hellondk_MainActivity_resta(JNIEnv *env,
		jobject obj, jint numero1, jint numero2) {
	return numero1 - numero2;
}
