import {useFonts, OpenSans_400Regular, OpenSans_700Bold} from '@expo-google-fonts/open-sans'
import AppLoading from 'expo-app-loading';
import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View } from 'react-native';
import Routes from './src/Routes';


export default function App() {
  let [fonstLoaded] = useFonts({
    OpenSans_400Regular,
    OpenSans_700Bold
  });

  if (!fonstLoaded) {
    return <AppLoading />;
  }
  return (
    <View style={styles.container}>
      <StatusBar style="auto" />
      <Routes />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
});
