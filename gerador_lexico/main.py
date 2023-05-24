import sys
from antlr4 import *
from gramatica2 import gramatica2

# Verifique se foi fornecido o nome do arquivo como argumento
if len(sys.argv) < 3:
    print("É necessário fornecer o nome dos arquivos de entrada e saida como argumento.")
    sys.exit(1)

# Obtém o nome do arquivo a partir dos argumentos
input_file_name = sys.argv[1]
output_file_name = sys.argv[2]

try:
    # Crie um objeto FileStream com o arquivo de entrada
    input_stream = FileStream(input_file_name, encoding='utf-8')

    # Inicialize o analisador léxico com o input stream
    lexer = gramatica2(input_stream)

    # Obtenha o próximo token
    token = lexer.nextToken()

    tipos_definidos = ['IDENT', 'CADEIA', 'NUM_INT', 'NUM_REAL']

    output = open(output_file_name, 'w')

    # Itere sobre os tokens até encontrar o fim do arquivo
    while token.type != Token.EOF:

        txt = '\'' + token.text + '\''
        typeStr = gramatica2.symbolicNames[token.type]
        if (typeStr == 'Nao_fechado'):
            output.writelines('Linha ' + token.line + ': comentario nao fechado\n')
            break

        elif (typeStr == 'Literal_Nao_Fechada'):
            output.writelines('Linha ' + token.line + ': cadeia literal nao fechada\n')
            break

        elif(typeStr == 'ERR'):
            output.writelines('Linha ' + token.line + ': ' + token.text + ' - simbolo nao identificado\n')
            break

        else:    
            if (typeStr in tipos_definidos):
                output.writelines('<'+ txt + "," + typeStr + '>\n')
            else:
                output.writelines('<' + txt + ',' + txt + '>\n')
            
        # Obtenha o próximo token
        token = lexer.nextToken()

except IOError:
    print("Erro ao abrir o arquivo:", input_file_name)
