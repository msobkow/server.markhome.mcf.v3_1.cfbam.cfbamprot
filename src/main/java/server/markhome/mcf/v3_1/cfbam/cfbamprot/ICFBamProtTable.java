// Description: Java 25 protected interface for a Table record implementation

/*
 *	server.markhome.mcf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.mcf.v3_1.cfbam.cfbamprot;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cflib.xml.CFLibXmlUtil;
import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfint.cfintpub.*;
import server.markhome.mcf.v3_1.cfbam.cfbampub.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;
import server.markhome.mcf.v3_1.cfbam.cfbampubobj.*;
import server.markhome.mcf.v3_1.cfbam.cfbamprotobj.*;

/**
 *	ICFBamProtTable persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ICFBamProtTable extends ICFBamProtScope
{
	public static final ICFBamProtSchema.LoaderBehaviourEnum LOADERBEHAVIOUR_MIN_VALUE = ICFBamProtSchema.LoaderBehaviourEnum.Insert;
	public static final ICFBamProtSchema.SecScopeEnum SECSCOPE_MIN_VALUE = ICFBamProtSchema.SecScopeEnum.None;
	public static final ICFBamProtSchema.CodeVisibilityEnum CODEVIS_MIN_VALUE = ICFBamProtSchema.CodeVisibilityEnum.Public;
	public static final ICFBamProtSchema.LoaderBehaviourEnum LOADERBEHAVIOUR_MAX_VALUE = ICFBamProtSchema.LoaderBehaviourEnum.Replace;
	public static final ICFBamProtSchema.SecScopeEnum SECSCOPE_MAX_VALUE = ICFBamProtSchema.SecScopeEnum.TenantGroup;
	public static final ICFBamProtSchema.CodeVisibilityEnum CODEVIS_MAX_VALUE = ICFBamProtSchema.CodeVisibilityEnum.Private;
	public static final String S_SCHEMADEFID_INIT_VALUE = ICFBamPubTable.S_SCHEMADEFID_INIT_VALUE;
	public static final CFLibDbKeyHash256 SCHEMADEFID_INIT_VALUE = ICFBamPubTable.SCHEMADEFID_INIT_VALUE;
	public static final String S_DEFSCHEMAID_INIT_VALUE = ICFBamPubTable.S_DEFSCHEMAID_INIT_VALUE;
	public static final CFLibDbKeyHash256 DEFSCHEMAID_INIT_VALUE = ICFBamPubTable.DEFSCHEMAID_INIT_VALUE;
	public static final String NAME_INIT_VALUE = ICFBamPubTable.NAME_INIT_VALUE;
	public static final String S_PRIMARYINDEXID_INIT_VALUE = ICFBamPubTable.S_PRIMARYINDEXID_INIT_VALUE;
	public static final CFLibDbKeyHash256 PRIMARYINDEXID_INIT_VALUE = ICFBamPubTable.PRIMARYINDEXID_INIT_VALUE;
	public static final String S_LOOKUPINDEXID_INIT_VALUE = ICFBamPubTable.S_LOOKUPINDEXID_INIT_VALUE;
	public static final CFLibDbKeyHash256 LOOKUPINDEXID_INIT_VALUE = ICFBamPubTable.LOOKUPINDEXID_INIT_VALUE;
	public static final String S_ALTINDEXID_INIT_VALUE = ICFBamPubTable.S_ALTINDEXID_INIT_VALUE;
	public static final CFLibDbKeyHash256 ALTINDEXID_INIT_VALUE = ICFBamPubTable.ALTINDEXID_INIT_VALUE;
	public static final String S_QUALIFYINGTABLEID_INIT_VALUE = ICFBamPubTable.S_QUALIFYINGTABLEID_INIT_VALUE;
	public static final CFLibDbKeyHash256 QUALIFYINGTABLEID_INIT_VALUE = ICFBamPubTable.QUALIFYINGTABLEID_INIT_VALUE;
	public static final ICFBamPubSchema.LoaderBehaviourEnum LOADERBEHAVIOUR_INIT_VALUE = ICFBamPubTable.LOADERBEHAVIOUR_INIT_VALUE;
	public static final ICFBamPubSchema.SecScopeEnum SECSCOPE_INIT_VALUE = ICFBamPubTable.SECSCOPE_INIT_VALUE;
	public static final ICFBamPubSchema.CodeVisibilityEnum CODEVIS_INIT_VALUE = ICFBamPubTable.CODEVIS_INIT_VALUE;
	public final static int CLASS_CODE = 0xa807;
	public final static String S_CLASS_CODE = "a807";

	public ICFBamProtSchemaDef getRequiredContainerSchemaDef();
	public ICFBamProtSchemaDef getOptionalLookupDefSchema();
	public ICFBamProtIndex getOptionalLookupLookupIndex();
	public ICFBamProtIndex getOptionalLookupAltIndex();
	public ICFBamProtTable getOptionalLookupQualTable();
	public ICFBamProtIndex getOptionalLookupPrimaryIndex();
	public void setRequiredContainerSchemaDef(ICFBamProtSchemaDef argObj);
	public void setRequiredContainerSchemaDef(ICFBamPubSchemaDef argObj);
	public void setRequiredContainerSchemaDef(CFLibDbKeyHash256 argSchemaDefId);
	public void setOptionalLookupDefSchema(ICFBamProtSchemaDef argObj);
	public void setOptionalLookupDefSchema(ICFBamPubSchemaDef argObj);
	public void setOptionalLookupDefSchema(CFLibDbKeyHash256 argDefSchemaId);
	public void setOptionalLookupLookupIndex(ICFBamProtIndex argObj);
	public void setOptionalLookupLookupIndex(ICFBamPubIndex argObj);
	public void setOptionalLookupLookupIndex(CFLibDbKeyHash256 argLookupIndexId);
	public void setOptionalLookupAltIndex(ICFBamProtIndex argObj);
	public void setOptionalLookupAltIndex(ICFBamPubIndex argObj);
	public void setOptionalLookupAltIndex(CFLibDbKeyHash256 argAltIndexId);
	public void setOptionalLookupQualTable(ICFBamProtTable argObj);
	public void setOptionalLookupQualTable(ICFBamPubTable argObj);
	public void setOptionalLookupQualTable(CFLibDbKeyHash256 argQualifyingTableId);
	public void setOptionalLookupPrimaryIndex(ICFBamProtIndex argObj);
	public void setOptionalLookupPrimaryIndex(ICFBamPubIndex argObj);
	public void setOptionalLookupPrimaryIndex(CFLibDbKeyHash256 argPrimaryIndexId);
	public CFLibDbKeyHash256 getRequiredSchemaDefId();
	public CFLibDbKeyHash256 getOptionalDefSchemaId();
	public String getRequiredName();
	public void setRequiredName( String value );
	public CFLibDbKeyHash256 getOptionalPrimaryIndexId();
	public CFLibDbKeyHash256 getOptionalLookupIndexId();
	public CFLibDbKeyHash256 getOptionalAltIndexId();
	public CFLibDbKeyHash256 getOptionalQualifyingTableId();
	public ICFBamPubSchema.LoaderBehaviourEnum getRequiredLoaderBehaviour();
	public void setRequiredLoaderBehaviour( ICFBamPubSchema.LoaderBehaviourEnum value );
	public ICFBamPubSchema.SecScopeEnum getRequiredSecScope();
	public void setRequiredSecScope( ICFBamPubSchema.SecScopeEnum value );
	public ICFBamPubSchema.CodeVisibilityEnum getRequiredCodeVis();
	public void setRequiredCodeVis( ICFBamPubSchema.CodeVisibilityEnum value );
	@Override
	public boolean equals( Object obj );
	
	@Override
	public int hashCode();

	//@Override not necessary because interfaces aren't able to implement Comparable, but they can double-team on the requirement
	public int compareTo( Object obj );

	public void set( ICFBamProtScope src );
	public void setTable( ICFBamProtTable src );
	public void set( ICFBamPubScope src );
	public void set( ICFBamProtScopeH src );
	public void setTable( ICFBamProtTableH src );
	public void set( ICFBamPubScopeH src );
	public void setTable( ICFBamPubTableH src );

}
