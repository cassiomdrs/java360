import {Text,View,Image,StyleSheet} from "react-native";

export default function Index() {
    return (
        <View style={styles.container}>
            <Image source={require('./logo.png')} style={styles.imagem}/>
            <Text style={styles.text}>Pomonai App</Text>
        </View>
    );
}

const styles = StyleSheet.create({
    container:{
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
        backgroundColor: "#021123",
        color: '#ffffff'
    },

    text:{
        fontSize: 50,
        color: "#ffffff",
        fontWeight: 'bold'
    },

    imagem:{
        width: 512,
        height: 146,
        resizeMode: 'contain'
    }
})