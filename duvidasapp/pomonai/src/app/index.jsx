import { useState } from 'react';
import { Image, StyleSheet, Text, TextInput, TouchableOpacity, View } from "react-native";

export default function Index() {

    const [texto, setDuvida] = useState("");
    const enviarDuvida = async () => {
        try {
            const response = await fetch('http://localhost:8080/duvida', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ texto }),
            });

            // 1. Descomente e ajuste para tratar caso o servidor retorne erro
            if (response.ok) {
                alert("Dúvida enviada com sucesso!");
                setDuvida("");
            } else {
                alert("Erro do servidor: " + response.status);
            }

        } catch (error) {
            console.error(error);
            alert("Erro de conexão: " + error.message);
        }
    }

    return (
        <View style={styles.container}>
            <Image source={require('./logo.png')} style={styles.imagem} />
            <Text style={styles.text}>Pomonai App</Text>
            <TextInput
                style={styles.textInput}
                placeholderTextColor="#727272"
                placeholder="Digite sua dúvida..."
                value={texto}
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
        backgroundColor: "#0a0d4c",
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
        borderColor: "#ffffff",
        padding: 10,
        margin: 10,
        width: '80%',
        color: "#ffffff",
        borderRadius: 5,
        width: 400,
        maxWidth: "100%",
        backgroundColor: "#141a6b",
        borderWidth: 2,
        borderColor: "#4da3ff",
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