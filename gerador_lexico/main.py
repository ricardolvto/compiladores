import sys
from antlr4 import *
from gramatica2 import gramatica2

# Verifique se foi fornecido o nome do arquivo como argumento
if len(sys.argv) < 2:
    print("É necessário fornecer o nome do arquivo de entrada como argumento.")
    sys.exit(1)

# Obtém o nome do arquivo a partir dos argumentos
input_file_name = sys.argv[1]

try:
    # Crie um objeto FileStream com o arquivo de entrada
    input_stream = FileStream(input_file_name, encoding='utf-8')

    # Inicialize o analisador léxico com o input stream
    lexer = gramatica2(input_stream)

    # Obtenha o próximo token
    token = lexer.nextToken()

    tipos_definidos = ['IDENT', 'CADEIA', 'NUM_INT', 'NUM_REAL']


    # Itere sobre os tokens até encontrar o fim do arquivo
    while token.type != Token.EOF:

        txt = '\'' + token.text + '\''
        typeStr = gramatica2.symbolicNames[token.type]
        if (typeStr == 'Nao_fechado'):
            print('Linha ' + token.line + ': comentario nao fechado')
            break

        elif (typeStr == 'Literal_Nao_Fechada'):
            print('Linha ' + token.line + ': cadeia literal nao fechada')
            break

        elif(typeStr == 'ERR'):
            print('Linha ' + token.line + ': ' + token.text + ' - simbolo nao identificado')
            break

        else:    
            if (typeStr in tipos_definidos):
                print('<'+ txt + "," + typeStr + '>')
            else:
                print('<' + txt + ',' + txt + '>')
            
        # Obtenha o próximo token
        token = lexer.nextToken()

except IOError:
    print("Erro ao abrir o arquivo:", input_file_name)
