<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<head>
				<title></title>
			</head>
			<body>
				<table border='1'>
					<h1>Liste des comptes</h1>
					<xsl:variable name="somme">
  <xsl:value-of select="sum(BanqueService/getComptes/solde)"></xsl:value-of>
 </xsl:variable>
					<p>la somme est: 
     <xsl:value-of select="$somme"></xsl:value-of>
    </p>
					<tr>
						<th>code</th>
						<th>solde</th>
						<th>dataCreation</th>
					</tr>

					<xsl:for-each
						select="BanqueService/getComptes[substring(dataCreation,1,4 )>2000]">
						<tr>
							<td>
								<xsl:value-of select="code" />
							</td>
							<td>
								<xsl:value-of select="solde" />
							</td>
							<td>
								<xsl:value-of select="dataCreation" />
							</td>
						</tr>
					</xsl:for-each>
					<xsl:variable name="somme2">
  <xsl:value-of select="sum(BanqueService/getComptes[substring(date, 1,4)>2000]/solde)"></xsl:value-of>
 </xsl:variable>
<p>la somme est: 
     <xsl:value-of select="$somme2"></xsl:value-of>
    </p>
				</table>
			</body>



		</html>

	</xsl:template>


</xsl:stylesheet>