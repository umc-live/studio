<?xml version="1.0" encoding="UTF-8"?>
<!--
  ~ Copyright (C) 2007-2020 Crafter Software Corporation. All Rights Reserved.
  ~
  ~ This program is free software: you can redistribute it and/or modify
  ~ it under the terms of the GNU General Public License version 3 as published by
  ~ the Free Software Foundation.
  ~
  ~ This program is distributed in the hope that it will be useful,
  ~ but WITHOUT ANY WARRANTY; without even the implied warranty of
  ~ MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  ~ GNU General Public License for more details.
  ~
  ~ You should have received a copy of the GNU General Public License
  ~ along with this program.  If not, see <http://www.gnu.org/licenses/>.
  -->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">

    <!-- to keep the right formatting -->
    <xsl:output method="xml" indent="yes" />
    <xsl:strip-space elements="*"/>

    <!-- copy all elements -->
    <xsl:template match="node() | @*">
        <xsl:copy>
            <xsl:apply-templates select="node() | @*"/>
        </xsl:copy>
    </xsl:template>

    <!-- insert line breaks before and after top level comments -->
    <xsl:template match="/comment()">
        <xsl:text>&#10;</xsl:text><xsl:copy-of select="."/><xsl:text>&#10;</xsl:text>
    </xsl:template>

    <xsl:template match="datasources">
        <datasources>
            <!-- copy all existing datasources -->
            <xsl:apply-templates select="node() | @*"/>

            <!-- add new ones if missing -->
            <xsl:if test="not(datasource/name = 'WebDAV-repo')">
                <datasource>
                    <name>WebDAV-repo</name>
                    <icon>
                        <class>fa-square-o fa-server</class>
                    </icon>
                </datasource>
            </xsl:if>

            <xsl:if test="not(datasource/name = 'img-WebDAV-repo')">
                <datasource>
                    <name>img-WebDAV-repo</name>
                    <icon>
                        <class>fa-square-o fa-server</class>
                    </icon>
                </datasource>
            </xsl:if>

            <xsl:if test="not(datasource/name = 'video-WebDAV-repo')">
                <datasource>
                    <name>video-WebDAV-repo</name>
                    <icon>
                        <class>fa-square-o fa-server</class>
                    </icon>
                </datasource>
            </xsl:if>

            <xsl:if test="not(datasource/name = 'WebDAV-upload')">
                <datasource>
                    <name>WebDAV-upload</name>
                    <icon>
                        <class>fa-square-o fa-server</class>
                    </icon>
                </datasource>
            </xsl:if>

            <xsl:if test="not(datasource/name = 'img-WebDAV-upload')">
                <datasource>
                    <name>img-WebDAV-upload</name>
                    <icon>
                        <class>fa-square-o fa-server</class>
                    </icon>
                </datasource>
            </xsl:if>

            <xsl:if test="not(datasource/name = 'video-WebDAV-upload')">
                <datasource>
                    <name>video-WebDAV-upload</name>
                    <icon>
                        <class>fa-square-o fa-server</class>
                    </icon>
                </datasource>
            </xsl:if>
        </datasources>
    </xsl:template>

</xsl:stylesheet>