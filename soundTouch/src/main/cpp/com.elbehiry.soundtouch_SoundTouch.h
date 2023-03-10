/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
#ifndef _Included_com_elbehiry_soundtouch_SoundTouch
#define _Included_com_elbehiry_soundtouch_SoundTouch
#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT jstring JNICALL Java_com_elbehiry_soundtouch_SoundTouch_getVersionString
  (JNIEnv *, jclass);

JNIEXPORT void JNICALL Java_com_elbehiry_soundtouch_SoundTouch_setTempo
  (JNIEnv *, jobject, jlong, jfloat);

JNIEXPORT void JNICALL Java_com_elbehiry_soundtouch_SoundTouch_setPitchSemiTones
  (JNIEnv *, jobject, jlong, jfloat);

JNIEXPORT void JNICALL Java_com_elbehiry_soundtouch_SoundTouch_setSpeed
  (JNIEnv *, jobject, jlong, jfloat);

JNIEXPORT jint JNICALL Java_com_elbehiry_soundtouch_SoundTouch_processFile
  (JNIEnv *, jobject, jlong, jstring, jstring);

JNIEXPORT jstring JNICALL Java_com_elbehiry_soundtouch_SoundTouch_getErrorString
  (JNIEnv *, jclass);

JNIEXPORT jlong JNICALL Java_com_elbehiry_soundtouch_SoundTouch_newInstance
  (JNIEnv *, jclass);

JNIEXPORT void JNICALL Java_com_elbehiry_soundtouch_SoundTouch_deleteInstance
  (JNIEnv *, jobject, jlong);

#ifdef __cplusplus
}
#endif
#endif
