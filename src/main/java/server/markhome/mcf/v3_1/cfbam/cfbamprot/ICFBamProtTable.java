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
import server.markhome.mcf.v3_1.cflib.keyhash.*;
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
public interface ICFBamProtTable
	extends ICFBamProtScope
{
	public static final ICFBamPubSchema.LoaderBehaviourEnum LOADERBEHAVIOUR_MIN_VALUE = ICFBamPubSchema.LoaderBehaviourEnum.Insert;
	public static final ICFBamPubSchema.SecScopeEnum SECSCOPE_MIN_VALUE = ICFBamPubSchema.SecScopeEnum.None;
	public static final ICFBamPubSchema.CodeVisibilityEnum CODEVIS_MIN_VALUE = ICFBamPubSchema.CodeVisibilityEnum.Public;
	public static final ICFBamPubSchema.LoaderBehaviourEnum LOADERBEHAVIOUR_MAX_VALUE = ICFBamPubSchema.LoaderBehaviourEnum.Replace;
	public static final ICFBamPubSchema.SecScopeEnum SECSCOPE_MAX_VALUE = ICFBamPubSchema.SecScopeEnum.TenantGroup;
	public static final ICFBamPubSchema.CodeVisibilityEnum CODEVIS_MAX_VALUE = ICFBamPubSchema.CodeVisibilityEnum.Private;
	public static final String S_SCHEMADEFID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFLibDbKeyHash256 SCHEMADEFID_INIT_VALUE = CFLibDbKeyHash256.fromHex( S_SCHEMADEFID_INIT_VALUE );
	public static final String S_DEFSCHEMAID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFLibDbKeyHash256 DEFSCHEMAID_INIT_VALUE = CFLibDbKeyHash256.fromHex( S_DEFSCHEMAID_INIT_VALUE );
	public static final String NAME_INIT_VALUE = new String( "" );
	public final static boolean PAGEDATA_INIT_VALUE = false;
	public static final String S_PRIMARYINDEXID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFLibDbKeyHash256 PRIMARYINDEXID_INIT_VALUE = CFLibDbKeyHash256.fromHex( S_PRIMARYINDEXID_INIT_VALUE );
	public static final String TABLECLASSCODE_INIT_VALUE = new String( "" );
	public static final String S_LOOKUPINDEXID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFLibDbKeyHash256 LOOKUPINDEXID_INIT_VALUE = CFLibDbKeyHash256.fromHex( S_LOOKUPINDEXID_INIT_VALUE );
	public static final String S_ALTINDEXID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFLibDbKeyHash256 ALTINDEXID_INIT_VALUE = CFLibDbKeyHash256.fromHex( S_ALTINDEXID_INIT_VALUE );
	public static final String S_QUALIFYINGTABLEID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFLibDbKeyHash256 QUALIFYINGTABLEID_INIT_VALUE = CFLibDbKeyHash256.fromHex( S_QUALIFYINGTABLEID_INIT_VALUE );
	public final static boolean ISINSTANTIABLE_INIT_VALUE = true;
	public final static boolean HASHISTORY_INIT_VALUE = false;
	public final static boolean HASAUDITCOLUMNS_INIT_VALUE = false;
	public final static boolean ISMUTABLE_INIT_VALUE = false;
	public final static boolean ISSERVERONLY_INIT_VALUE = false;
	public static final ICFBamPubSchema.LoaderBehaviourEnum LOADERBEHAVIOUR_INIT_VALUE = ICFBamPubSchema.ordinalToLoaderBehaviourEnum( 0 );
	public static final ICFBamPubSchema.SecScopeEnum SECSCOPE_INIT_VALUE = ICFBamPubSchema.ordinalToSecScopeEnum( 0 );
	public static final ICFBamPubSchema.CodeVisibilityEnum CODEVIS_INIT_VALUE = ICFBamPubSchema.ordinalToCodeVisibilityEnum( 0 );
	public final static int CLASS_CODE = 0xa807;
	public final static String S_CLASS_CODE = "a807";

	public ICFBamProtSchemaDef get$OptionalOrRequired$ContainerSchemaDef();

	public void set$OptionalOrRequired$ContainerSchemaDef($implIJavaAtomType$ argSchemaDefId);


	public void set$OptionalOrRequired$ContainerSchemaDef(ICFBamProtSchemaDef argObj);

	public void set$OptionalOrRequired$ContainerSchemaDef(ICFBamPubSchemaDef argObj);

	public ICFBamProtSchemaDef get$OptionalOrRequired$LookupDefSchema();

	public void set$OptionalOrRequired$LookupDefSchema($implIJavaAtomType$ argDefSchemaId);


	public void set$OptionalOrRequired$LookupDefSchema(ICFBamProtSchemaDef argObj);

	public void set$OptionalOrRequired$LookupDefSchema(ICFBamPubSchemaDef argObj);

	public ICFBamProtIndex get$OptionalOrRequired$LookupLookupIndex();

	public void set$OptionalOrRequired$LookupLookupIndex($implIJavaAtomType$ argLookupIndexId);


	public void set$OptionalOrRequired$LookupLookupIndex(ICFBamProtIndex argObj);

	public void set$OptionalOrRequired$LookupLookupIndex(ICFBamPubIndex argObj);

	public ICFBamProtIndex get$OptionalOrRequired$LookupAltIndex();

	public void set$OptionalOrRequired$LookupAltIndex($implIJavaAtomType$ argAltIndexId);


	public void set$OptionalOrRequired$LookupAltIndex(ICFBamProtIndex argObj);

	public void set$OptionalOrRequired$LookupAltIndex(ICFBamPubIndex argObj);

	public ICFBamProtTable get$OptionalOrRequired$LookupQualTable();

	public void set$OptionalOrRequired$LookupQualTable($implIJavaAtomType$ argQualifyingTableId);


	public void set$OptionalOrRequired$LookupQualTable(ICFBamProtTable argObj);

	public void set$OptionalOrRequired$LookupQualTable(ICFBamPubTable argObj);

	public ICFBamProtIndex get$OptionalOrRequired$LookupPrimaryIndex();

	public void set$OptionalOrRequired$LookupPrimaryIndex($implIJavaAtomType$ argPrimaryIndexId);


	public void set$OptionalOrRequired$LookupPrimaryIndex(ICFBamProtIndex argObj);

	public void set$OptionalOrRequired$LookupPrimaryIndex(ICFBamPubIndex argObj);

	public List<ICFBamProtRelation> get$OptionalOrRequired$ComponentsRelation();

	public List<ICFBamProtIndex> get$OptionalOrRequired$ComponentsIndex();

	public List<ICFBamProtValue> get$OptionalOrRequired$ComponentsColumns();

	public List<ICFBamProtRelation> get$OptionalOrRequired$ChildrenReverseRelations();

	public List<ICFBamProtChain> get$OptionalOrRequired$ComponentsChains();

	public List<ICFBamProtDelTopDep> get$OptionalOrRequired$ComponentsDelDep();

	public List<ICFBamProtClearTopDep> get$OptionalOrRequired$ComponentsClearDep();

	public List<ICFBamProtServerMethod> get$OptionalOrRequired$ComponentsServerMethods();

	public List<ICFBamProtTweak> get$OptionalOrRequired$ComponentsTweaks();

	public $implIJavaAtomType$ getRequiredSchemaDefId();
	public void setRequiredSchemaDefId( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getOptionalDefSchemaId();
	public void setOptionalDefSchemaId( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getRequiredName();
	public void setRequiredName( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getOptionalDbName();
	public void setOptionalDbName( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getOptionalShortName();
	public void setOptionalShortName( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getOptionalLabel();
	public void setOptionalLabel( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getOptionalShortDescription();
	public void setOptionalShortDescription( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getOptionalDescription();
	public void setOptionalDescription( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getRequiredPageData();
	public void setRequiredPageData( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getOptionalPrimaryIndexId();
	public void setOptionalPrimaryIndexId( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getRequiredTableClassCode();
	public void setRequiredTableClassCode( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getOptionalLookupIndexId();
	public void setOptionalLookupIndexId( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getOptionalAltIndexId();
	public void setOptionalAltIndexId( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getOptionalQualifyingTableId();
	public void setOptionalQualifyingTableId( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getRequiredIsInstantiable();
	public void setRequiredIsInstantiable( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getRequiredHasHistory();
	public void setRequiredHasHistory( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getRequiredHasAuditColumns();
	public void setRequiredHasAuditColumns( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getRequiredIsMutable();
	public void setRequiredIsMutable( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getRequiredIsServerOnly();
	public void setRequiredIsServerOnly( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getRequiredLoaderBehaviour();
	public void setRequiredLoaderBehaviour( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getRequiredSecScope();
	public void setRequiredSecScope( $implIJavaAtomType$ value );
	public $implIJavaAtomType$ getRequiredCodeVis();
	public void setRequiredCodeVis( $implIJavaAtomType$ value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( ICFBamProtScope src );

	public void setTable( ICFBamProtTable src );

	public void set( ICFBamProtScopeH src );

	public void setTable( ICFBamProtTableH src );

	public void set( ICFBamPubScope src );

	public void setTable( ICFBamPubTable src );

	public void set( ICFBamPubScopeH src );

	public void setTable( ICFBamPubTableH src );

	public String getXmlAttrFragment();

	public String toString();
}
