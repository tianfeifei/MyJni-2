
#include "com_example_tianfei_myjni_2_MainActivity.h"

JNIEXPORT jstring JNICALL Java_com_example_tianfei_myjni_12_MainActivity_displayJni
  (JNIEnv *env, jobject obj)
{
  return (*env)->NewStringUTF(env,"Hello JNI!");
  }
