import { useState } from 'react';
import { Alert, Image, StyleSheet, Text, TextInput, TouchableOpacity, View } from "react-native";

export default function Index() {

    const [duvida, setDuvida] = useState("");
    const enviarDuvida = async () => {
        try {
            const response = await fetch('http://localhost:8080/duvida', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ duvida }),
            });

            //if (!response.ok) {
            //    throw new Error(`Erro na requisição: ${response.statusText}`);
            //};

            Alert.alert("Dúvida enviada com sucesso!");
        } catch (error) {
            Alert.alert("Erro ao enviar dúvida");
        }
    }

    return (
        <View style={styles.container}>
            <Image source={require('./logo.png')} style={styles.imagem} />
            <Text style={styles.text}>Pomonai App</Text>
            <TextInput
                style={styles.textInput}
                placeholder="Digite sua dúvida..."
                value={duvida}
                onChangeText={setDuvida}
            />
            
            <TouchableOpacity style={styles.button} onPress={enviarDuvida}>
                <Text style={styles.buttonText}>Enviar dúvida</Text>
            </TouchableOpacity>

        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
        backgroundColor: "#021123",
        color: '#ffffff'
    },

    text: {
        fontSize: 30,
        color: "#ffffff",
        fontWeight: 'bold'
    },

    imagem: {
        width: 250,
        height: 100,
        resizeMode: 'contain'
    },

    textInput: {
        borderWidth: 1,
        borderColor: "#cccccc",
        padding: 10,
        margin: 10,
        width: '80%',
        color: "#ffffff",
        borderRadius: 5,
    },

    button: {
        margin: 10,
        padding: 10,
        backgroundColor: "#007bff",
        borderRadius: 5,
    },

    buttonText: {
        color: "#ffffff",
        fontSize: 16,
        fontWeight: 'bold',
    },
})